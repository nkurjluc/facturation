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

    public FamilleEntity toEntity(FamilleDto familleDto){
        if(familleDto==null)
            return null;
        else{
            FamilleEntity famille = new FamilleEntity();
            famille.setId(familleDto.getId());
            famille.setCode(familleDto.getCode());
            famille.setLibelle(familleDto.getLibelle());

            return famille;
        }
    }

}
