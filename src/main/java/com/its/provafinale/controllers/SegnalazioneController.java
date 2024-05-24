package com.its.provafinale.controllers;

import com.its.provafinale.dtos.SegnalazioneDto;
import com.its.provafinale.services.SegnalazioneService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/segnalazioni")
public class SegnalazioneController {
    @Autowired
    private SegnalazioneService service;

    @Operation(summary = "Inserisce una nuova segnalazione")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "La segnalazione creata correttamente")
    })
    @PostMapping(value = "/")
    public ResponseEntity<Boolean> create(@RequestBody SegnalazioneDto dto){
        boolean create = service.createSegnalazione(dto);
        return new ResponseEntity<>(create, HttpStatus.OK);
    }

    @Operation(summary = "Elimina una segnalazione esistente")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Segnalazione eliminata correttamente")
    })
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable long id){
        boolean delete = service.deleteSegnalazione(id);
        return new ResponseEntity<>(delete, HttpStatus.OK);
    }

    @Operation(summary = "Recupera l'elenco delle segnalazioni filtrato")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Lista recuperata correttamente")
    })
    @GetMapping(value = "/")
    public ResponseEntity<List<SegnalazioneDto>> getFilteredSegnalazioni(@RequestParam(required = false) String surname, @RequestParam(required = false) LocalDate date){
        List<SegnalazioneDto> list = service.getFilteredSegnalazioni(surname, date);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
