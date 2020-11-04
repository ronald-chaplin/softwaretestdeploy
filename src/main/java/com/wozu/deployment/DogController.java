package com.wozu.deployment;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/breeds")
public class DogController {

    @GetMapping("/image/random")
    public JSONObject getDog(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("messages", "https://images.dog.ceo/breeds/pointer-germanlonghair/hans2.jpg\n");
        jsonObject.put("status", "success");
        return jsonObject;

    }

}
