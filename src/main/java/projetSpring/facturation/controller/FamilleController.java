package projetSpring.facturation.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import projetSpring.facturation.dto.FamilleDto;
import projetSpring.facturation.helper.ResponseHelper;
import projetSpring.facturation.helper.MessageHelper;
import projetSpring.facturation.services.FamilleService;

@RestController
@RequestMapping("/familly")
public class FamilleController {
    @Autowired
    FamilleService familleService;
    
    @RequestMapping(value = "/", method = RequestMethod.POST)
        public ResponseEntity<?> enregistrer(HttpServletRequest request, @RequestBody FamilleDto familleDto) {
            
            if (familleDto.getCode().length() >10)   
                    return new ResponseEntity<>(new ResponseHelper(projetSpring.facturation.helper.MessageHelper.sizeExceed("Code", 0)), HttpStatus.BAD_REQUEST);             
                   
                    FamilleDto dto = familleService.insertFamille(request, familleDto);
                    
                    if (dto == null)                        
                        return new ResponseEntity<>(new ResponseHelper(MessageHelper.echec(), false),
                                                HttpStatus.BAD_REQUEST);
                        else {        
                        return new ResponseEntity<>(new ResponseHelper(MessageHelper.success(), dto, true),
                                                HttpStatus.OK);
                }
                    
    }

    @RequestMapping(value = "/get_all", method = RequestMethod.GET)
        public List<FamilleDto> getFamilles() {
            return familleService.allNoFilter();
        }

}
