package projetSpring.facturation.mapper;

import projetSpring.facturation.dto.FamilleDto;
import projetSpring.facturation.entity.FamilleEntity;

public class FamilleConvertDto {
    
    public FamilleConvertDto(){

    }

    public static FamilleConvertDto getInstance(){
        return new FamilleConvertDto();
    }

    public FamilleDto toDto (FamilleEntity famille){
        FamilleDto familleDto = new FamilleDto();

        familleDto.setId(famille.getId());
        familleDto.setCode(famille.getCode());
        familleDto.setLibelle(famille.getLibelle());

        return familleDto;
    }

    public FamilleEntity toEntity(FamilleDto classeDto){
        if(classeDto==null)
            return null;
        else{
            FamilleEntity famille = new FamilleEntity();
            famille.setId(classeDto.getId());
            famille.setCode(classeDto.getCode());
            famille.setLibelle(classeDto.getLibelle());

            return famille;
        }
    }

}
