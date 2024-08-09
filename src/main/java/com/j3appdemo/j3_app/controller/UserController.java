package com.j3appdemo.j3_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.j3appdemo.j3_app.models.User;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

   private List<String> viewItems = new ArrayList<>();

   @GetMapping("/list")
   public String showForm(Model model) {
      model.addAttribute("user", new User());
      model.addAttribute("viewItems", viewItems);
      model.addAttribute("title", "Visualizador de Contactos");
      return "list"; // Nombre del archivo HTML
   }

   @PostMapping("/viewItem01")
   public String viewItem01(@ModelAttribute("user") User user, Model model) {
      // Limpiar la lista y agregar solo el nombre de contacto
      viewItems.clear();
      viewItems.add(user.getNombreContacto());

      model.addAttribute("viewItems", viewItems);
      model.addAttribute("title", "Visualizador de Contactos");
      return "list";
   }

   @PostMapping("/viewItem02")
   public String viewItem02(@ModelAttribute("user") User user, Model model) {
      // Agregar el nombre y apellido a la lista sin limpiar
      if (user.getNombre() != null && !user.getNombre().isEmpty()) {
         viewItems.add("Nombre: " + user.getNombre());
      }
      if (user.getApellido() != null && !user.getApellido().isEmpty()) {
         viewItems.add("Apellido: " + user.getApellido());
      }

      model.addAttribute("viewItems", viewItems);
      model.addAttribute("title", "Visualizador de Contactos");
      return "list";
   }
}