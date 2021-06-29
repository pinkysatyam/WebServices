package com.psfroup.server.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psfroup.server.main.model.Name;
import com.psfroup.server.main.model.PersonV1;
import com.psfroup.server.main.model.PersonV2;

@RestController
public class PersonController {
//@GetMapping("person/v1")
//@GetMapping(value ="person/param",params="version=1")
@GetMapping(value="/person/header", headers="X-API-Version=1") 
public PersonV1 getV1() {
return new PersonV1("satyam pinky");
}
//@GetMapping("person/v2")
//@GetMapping(value ="person/param",params="version=2")
@GetMapping(value="/person/header", headers="X-API-Version=2") 
public PersonV2 getV2() {
return new PersonV2(new Name("satyam","pinky"));
}
}