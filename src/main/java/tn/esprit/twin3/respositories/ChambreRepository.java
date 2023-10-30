package tn.esprit.twin3.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.twin3.entities.Chambre;
import tn.esprit.twin3.entities.TypeChambre;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    List<Chambre> findChambreByBloc_NomBloc(String nom);
    int countChambresByTypeAAndBloc_IdBloc(TypeChambre typeChambre, long idBloc);
}
