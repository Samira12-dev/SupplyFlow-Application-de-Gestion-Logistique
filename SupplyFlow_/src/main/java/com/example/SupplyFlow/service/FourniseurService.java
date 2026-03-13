package com.example.SupplyFlow.service;

import com.example.SupplyFlow.model.Fourniseur;
import com.example.SupplyFlow.repository.FourniseurRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FourniseurService {
   private final FourniseurRepository fourniseurRepository;

   public FourniseurService(FourniseurRepository fourniseurRepository){
       this.fourniseurRepository=fourniseurRepository;
   }

   public List<Fourniseur> getAllFourniseur(){
       return fourniseurRepository.findAll();
   }

   public void saveFourniseur(Fourniseur fourniseur){
       fourniseurRepository.save(fourniseur);
   }

   public Fourniseur getFourniseurById(Long id){
       return fourniseurRepository.findById(id).orElse(null);
   }

   public void deleteFourniseur(Long id){
       fourniseurRepository.deleteById(id);
   }
}
