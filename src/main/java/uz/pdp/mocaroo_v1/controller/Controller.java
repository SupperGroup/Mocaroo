package uz.pdp.mocaroo_v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.mocaroo_v1.entity.Mocaroo;
import uz.pdp.mocaroo_v1.service.MocarooService;

import java.util.List;

/**
 * @author : Oyatjon  -> @data :4/20/2022 10:35
 */

@RestController
@RequestMapping("/api/mockaroo")
public class Controller {

    @Autowired
    MocarooService mocarooService;
    @PostMapping
    public HttpEntity<?> getData(@RequestBody Mocaroo mocaroo) {
        List<Mocaroo> data = mocarooService.getData(mocaroo);
        return ResponseEntity.ok(data);
    }

}
