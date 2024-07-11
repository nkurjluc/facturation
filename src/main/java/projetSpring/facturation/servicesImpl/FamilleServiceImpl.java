package projetSpring.facturation.servicesImpl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import projetSpring.facturation.dto.FamilleDto;
import projetSpring.facturation.entity.FamilleEntity;
import projetSpring.facturation.mapper.FamilleConvertDto;
import projetSpring.facturation.repository.FamilleRepository;
import projetSpring.facturation.services.FamilleService;

@Service

public class FamilleServiceImpl implements FamilleService {
    @Autowired
    private FamilleRepository familleRepository;

    @Override
    public FamilleDto insertFamille(HttpServletRequest request, FamilleDto familleDto, String jeton) {

        try {
            FamilleEntity familleEntity = FamilleConvertDto.getInstance().toEntity(familleDto);

            FamilleEntity famille = familleRepository.save(familleEntity);

            return FamilleConvertDto.getInstance().toDto(famille);            
        } catch (Exception e) {
            return null;
        }
        
    
    }

    @Override
    public FamilleDto insertFamille(HttpServletRequest request, FamilleDto familleDto) {
        
        try {
            FamilleEntity familleEntity = FamilleConvertDto.getInstance().toEntity(familleDto);
            
            FamilleEntity famille = familleRepository.save(familleEntity);
            
            return FamilleConvertDto.getInstance().toDto(famille);          
            
        } catch (Exception e) {
            return null;
        }        
    }

    @Override
    public FamilleDto getFamillyByCode(String code) {
        try {
            FamilleEntity famille = familleRepository.findFamillyByCode(code);

            return FamilleConvertDto.getInstance().toDto(famille);
        } catch (Exception e) {
            return null; 
        }
    }

    @Override
    public FamilleDto getFamillyById(Long id) {
        try {
            return FamilleConvertDto.getInstance().toDto(familleRepository.findById(id).get());
        } catch (Exception e) {
            return null;
        }
    }

    @Override
     public List<FamilleDto> allNoFilter() {
        List<FamilleEntity> data =  familleRepository.findAll();
        List<FamilleDto> list = new ArrayList<>();
        data.forEach(g -> {
            list.add(FamilleConvertDto.getInstance().toDto(g));
        });
        return list;
    }

    @Override
    public FamilleDto deleteFamilly(Long id) {
       try {
            
        return FamilleConvertDto.getInstance().toDto(familleRepository.findById(id).get());

       } catch (Exception e) {
        return null;
       }
    }


}
