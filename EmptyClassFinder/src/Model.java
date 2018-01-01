package roomsofrequirement;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author winn
 */
public class Model {

    private Controller appController;
    ArrayList<String> listOfRooms = new ArrayList();

    public Model(Controller appController) {
        this.appController = appController;

        constructList();
    }

    public void constructList() {
        listOfRooms.add("VEC");
        listOfRooms.add("ECS");
    }
}
