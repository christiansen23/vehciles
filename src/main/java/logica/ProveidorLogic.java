/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import dades.ProveidorDAO;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Classe de la lògica de negoci per gestionar proveïdors. S'encarrega de
 * manipular la llista de proveïdors i interactuar amb el DAO per dur a terme
 * operacions de consulta, inserció, modificació i eliminació.
 *
 * @author Anna
 */
public class ProveidorLogic {

    private ProveidorDAO proveidorDAO;
    ObservableList<Proveidor> llistaObservable;

    /**
     * Constructor que inicialitza el DAO de proveïdors i una llista observable.
     *
     * @throws SQLException si es produeix un error de base de dades en
     * inicialitzar el DAO.
     */
    public ProveidorLogic() throws SQLException {
        this.proveidorDAO = new ProveidorDAO();
        this.llistaObservable = FXCollections.observableArrayList();
    }

    /**
     * Esborra un proveïdor proporcionat de la base de dades.
     *
     * @param proveidor El proveïdor que es vol esborrar.
     * @throws Exception si el proveïdor proporcionat és null o si es produeix
     * un error durant l'operació.
     */
    public void esborrarProveidor(Proveidor proveidor) throws Exception {
        if (proveidor == null) {
            throw new Exception("El proveïdor no existeix");
        }
        //Cridem al DAO per esborrar el proveïdor.
        proveidorDAO.delete(proveidor);
    }

    /**
     * Modifica un proveïdor existent a la base de dades després de validar les
     * seves dades.
     *
     * @param proveidor El proveïdor que es vol modificar amb les noves dades.
     * @throws Exception Si qualsevol de les validacions falla o si es produeix
     * un error en l'actualització.
     */
    public void modificarProveidor(Proveidor proveidor) throws Exception {

        if (!ProveidorValidacions.validarCif(proveidor.getCif())) {
            throw new Exception("Format de CIF invàlid");
        }
        if (!ProveidorValidacions.validarCorreu(proveidor.getCorreu_electronic())) {
            throw new Exception("Format de correu electrònic invàlid");
        }
        if (!ProveidorValidacions.validarData(proveidor.getData_creacio().toString())) {
            throw new Exception("Format de data invàlid");
        }
        if (!ProveidorValidacions.validarValoracio(String.valueOf(proveidor.getRating_proveidor()))) {
            throw new Exception("Format de valoració invàlid.");
        }
        if (!ProveidorValidacions.validarMesos(String.valueOf(proveidor.getMesos_de_colaboracio()))) {
            throw new Exception("Format de Mesos de col·laboració invàlid");
        }

        proveidorDAO.update(proveidor);
    }

    /**
     * Afegeix un nou proveïdor a la llista observable i a la base de dades
     * després de validar les seves dades.
     *
     * @param proveidor El proveïdor que es vol afegir.
     * @throws Exception Si qualsevol de les validacions falla o si es produeix
     * un error durant l'operació.
     */
    public void afegirProveidor(Proveidor proveidor) throws Exception {

        if (!ProveidorValidacions.validarCif(proveidor.getCif())) {
            throw new Exception("Format de CIF invàlid");
        }
        if (!ProveidorValidacions.validarCorreu(proveidor.getCorreu_electronic())) {
            throw new Exception("Format de correu electrònic invàlid");
        }
        if (!ProveidorValidacions.validarData(proveidor.getData_creacio().toString())) {
            throw new Exception("Format de data invàlid");
        }
        if (!ProveidorValidacions.validarValoracio(String.valueOf(proveidor.getRating_proveidor()))) {
            throw new Exception("Format de valoració invàlid.");
        }
        if (!ProveidorValidacions.validarMesos(String.valueOf(proveidor.getMesos_de_colaboracio()))) {
            throw new Exception("Format de Mesos de col·laboració invàlid");
        }
        llistaObservable.add(proveidor);
        // Inserir el proveïdor al DAO
        proveidorDAO.insert(proveidor);
    }
}
