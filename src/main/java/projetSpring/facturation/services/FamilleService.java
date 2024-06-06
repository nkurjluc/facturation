package projetSpring.facturation.services;

import javax.servlet.http.HttpServletRequest;

import projetSpring.facturation.dto.FamilleDto;

public interface FamilleService {
    public FamilleDto insertClasse(HttpServletRequest request, FamilleDto classeDto,String jeton);

}
