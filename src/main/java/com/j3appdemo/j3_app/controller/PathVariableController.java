package com.j3appdemo.j3_app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.tags.Param;

import com.j3appdemo.j3_app.models.dto.ParamsDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



// @RestController
// @RequestMapping("api/params")
// public class RequestParamsController {
//     @GetMapping("/foo")
//     public ParamsDto foot(@RequestParam(required = false, defaultValue = "Hola Mundo") String message) {
//         ParamsDto param = new ParamsDto();
//         param.setMessage(message);
//         return param;
//         }
//     }


// @RequestMapping("api/demovar")
// public class PathVariableController {
//     @GetMapping("/saludo/{message}")
//     public ParamsDto saludo(@PathVariable String message) {
//         ParamsDto param = new ParamsDto();
//         param.setMessage(message);
//         return param;
//         }
//     }