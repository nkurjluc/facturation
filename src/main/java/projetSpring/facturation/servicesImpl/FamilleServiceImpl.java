package projetSpring.facturation.servicesImpl;

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
    public FamilleDto insertClasse(HttpServletRequest request, FamilleDto classeDto, String jeton) {

        try {
            FamilleEntity familleEntity = FamilleConvertDto.getInstance().toEntity(classeDto);

            FamilleEntity famille = familleRepository.save(familleEntity);

            return FamilleConvertDto.getInstance().toDto(famille);            
        } catch (Exception e) {
            return null;
        }
        
    
    }

}
