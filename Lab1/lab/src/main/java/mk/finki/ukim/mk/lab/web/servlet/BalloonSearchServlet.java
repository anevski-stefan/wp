package mk.finki.ukim.mk.lab.web.servlet;

import mk.finki.ukim.mk.lab.model.Balloon;
import mk.finki.ukim.mk.lab.service.BalloonService;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Author: Stefan Anevski
 */

@WebServlet(name = "balloon-search-servlet", urlPatterns = "/searchBalloon")
public class BalloonSearchServlet extends HttpServlet {
    private final BalloonService balloonService;
    private final SpringTemplateEngine springTemplateEngine;

    public BalloonSearchServlet(BalloonService balloonService, SpringTemplateEngine springTemplateEngine) {
        this.balloonService = balloonService;
        this.springTemplateEngine = springTemplateEngine;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        WebContext context = new WebContext(req, resp, req.getServletContext());
        String q = req.getParameter("q");
        List<Balloon> searched = balloonService.searchByNameOrDescription(q);
        context.setVariable("foundBalloons", searched);
        springTemplateEngine.process("displaySearchResults.html", context, resp.getWriter());
    }
}
