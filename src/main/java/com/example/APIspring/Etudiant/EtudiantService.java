package com.example.APIspring.Etudiant;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class EtudiantService {

    public List<Etudiant> getAllEtudiants()
    {
        return List.of
                (
                        new Etudiant(1l,"Sinan","sinan.ergun@gmail.com", LocalDate.of(2001, Month.MAY, 31),21)
                );
    }
}
