package com.example.__1_12.controller;

import com.example.__1_12.entity.Websites;
import com.example.__1_12.repository.WebsitesRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.tokens.CommentToken;

@RestController
@RequestMapping("/home")
public class HomeController {

    WebsitesRepository websitesRepository;

    public HomeController(WebsitesRepository websitesRepository) {
        this.websitesRepository = websitesRepository;
    }

    @GetMapping("/index")
    public String index() {
        Websites websites = new Websites();
        websites.setWebsiteId(101L);
/**     Comment Starts Here
 *      For spring boot version from 3.1.12 until 3.3.12
 *      websites.setWebsiteId(101L);
 *      setting a primary key value to a non-existing id (OR) null will create a new record
 *      Comment Ends Here
*/
        websites.setWebsiteName("www.baidu.com" + websites.getWebsiteId());
        websitesRepository.save(websites);
        return "index";
    }
}
