package projetSpring.facturation.services;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import projetSpring.facturation.dto.FamilleDto;

public interface FamilleService {
    public FamilleDto insertFamille(HttpServletRequest request, FamilleDto familleDto,String jeton);

    public FamilleDto insertFamille(HttpServletRequest request, FamilleDto familleDto);

    public FamilleDto deleteFamilly(Long id);

    public FamilleDto getFamillyByCode(String code);

    public FamilleDto getFamillyById(Long id);

    public List<FamilleDto> allNoFilter();

}
