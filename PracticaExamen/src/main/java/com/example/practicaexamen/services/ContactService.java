package com.example.practicaexamen.services;

import com.example.practicaexamen.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactService {

    private List<Contact> lista = new ArrayList<>();

    public List<String> loadForListView(){
        List<String> result = new ArrayList<>();

        for (Contact contact : lista){
            result.add(contact.getNombre()+"-"+contact.getTelefono()+"-"+contact.getParentesco());
        }
        return result;
    }



    public void addContact(String nombre, String telefono, String parentesco){

        validate(nombre, telefono, parentesco);

        for (Contact contacto : lista){
            if (contacto.getNombre().equalsIgnoreCase(nombre)){
                throw new IllegalArgumentException("Nombre repetido");
            }
        }

        lista.add(new Contact(nombre, telefono, parentesco));
    }

    public void updateContact(int index, String nombre, String telefono, String parentesco) {

        validate(nombre, telefono, parentesco);

        Contact contacto = lista.get(index);

        contacto.setNombre(nombre);
        contacto.setTelefono(telefono);
        contacto.setParentesco(parentesco);
    }


    public void deleteContact(int index) {

        lista.remove(index);
    }


    public Contact search(String nombre) {

        for (Contact contacto : lista) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                return contacto;
            }
        }

        return null;
    }


    public void validate(String nombre, String telefono, String parentesco){
        if (nombre==null || nombre.isBlank()){
            throw new IllegalArgumentException("Nombre vacio");
        }

        if (!nombre.matches("^[A-Za-z]+$")){
            throw new IllegalArgumentException("No contiene solo letras");
        }

        if (telefono==null || !telefono.matches("^[0-9]+$")){
            throw new IllegalArgumentException("Telefono incorrecto");
        }

        if (parentesco==null || parentesco.isBlank()){
            throw new IllegalArgumentException();
        }

    }

}
