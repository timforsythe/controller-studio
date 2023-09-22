package org.launchcode.skillstracker.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @ResponseBody
    @RequestMapping(value="")
    public String startSkills () {
        String html = "<h1>Skills Tracker</h1>" +
                "<h2>Here are some programming languages to learn:</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "<a href='http://localhost:8080/form'>Click here to rank</a>";

        return html;
    }

    @GetMapping(value="form")
    @ResponseBody
    public String formSkills() {
        String html = "<form method='post'>" +
                "Name:<br>" +
                "<input type = 'text' name = 'name' />" +
                "<br>My favorite language:<br>" +
                    "<select name = 'firstChoice'>" +
                        "<option value = 'Java'>Java</option>" +
                        "<option value = 'Javascript'>JavaScript</option>" +
                        "<option value = 'Python'>Python</option>" +
                    "</select>" +
                "<br> My second favorite language:<br>" +
                    "<select name = 'secondChoice'>" +
                        "<option value = 'Java'>Java</option>" +
                        "<option value = 'Javascript'>JavaScript</option>" +
                        "<option value = 'Python'>Python</option>" +
                    "</select>" +
                "<br>My third favorite language:<br>" +
                    "<select name = 'thirdChoice'>" +
                        "<option value = 'Java'>Java</option>" +
                        "<option value = 'Javascript'>JavaScript</option>" +
                        "<option value = 'Python'>Python</option>" +
                    "</select><br>" +
                "<input type = 'submit' value = 'Submit' />" +
                "</form>";

        return html;
    }

    @PostMapping(value="form")
    @ResponseBody
    public String namePage(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        String html = "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>" + thirdChoice + "</li>" +
                "</ol>";
        return html;
    }


}
