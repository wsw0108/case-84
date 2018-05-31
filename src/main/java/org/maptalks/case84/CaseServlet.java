package org.maptalks.case84;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.maptalks.servletrest.servlets.BaseServlet;

public class CaseServlet extends BaseServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        throw new NullPointerException("NPE");
    }
}
