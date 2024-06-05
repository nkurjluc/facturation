package projetSpring.facturation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projetSpring.facturation.entity.FamilleEntity;

@Repository
public interface FamilleRepository extends JpaRepository<FamilleEntity,Long>{
    
}
