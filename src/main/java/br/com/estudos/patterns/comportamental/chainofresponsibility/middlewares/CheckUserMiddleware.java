package br.com.estudos.patterns.comportamental.chainofresponsibility.middlewares;

import br.com.estudos.patterns.comportamental.chainofresponsibility.server.Server;

/**
 * Handler: Verifica se as credenciais do usuário existem.
 */
public class CheckUserMiddleware extends Middleware {
    private Server server;

    public CheckUserMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String passaword) {
        if (!server.hasEmail(email)) {
            System.out.println("Email inválido");
            return false;
        }

        if (!server.isValidPassword(email, passaword)) {
            System.out.println("E-mail ou senha inválido");
            return false;
        }
        return checkNext(email, passaword);
    }
}
