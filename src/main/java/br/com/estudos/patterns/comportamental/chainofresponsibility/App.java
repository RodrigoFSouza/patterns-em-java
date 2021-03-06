package br.com.estudos.patterns.comportamental.chainofresponsibility;

import br.com.estudos.patterns.comportamental.chainofresponsibility.middlewares.CheckPermissionMiddleware;
import br.com.estudos.patterns.comportamental.chainofresponsibility.middlewares.CheckUserMiddleware;
import br.com.estudos.patterns.comportamental.chainofresponsibility.middlewares.Middleware;
import br.com.estudos.patterns.comportamental.chainofresponsibility.middlewares.ThrottlingMiddleware;
import br.com.estudos.patterns.comportamental.chainofresponsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.registerUser("admin@exemplo.com", "admin@admin");
        server.registerUser("user@exemplo.com", "user@user");

        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new CheckUserMiddleware(server))
                .linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;

        do {
            System.out.println("Informe o email: ");
            String email = reader.readLine();

            System.out.println("Informe a senha: ");
            String password = reader.readLine();

            success = server.login(email, password);
        } while(!success);
    }
}
