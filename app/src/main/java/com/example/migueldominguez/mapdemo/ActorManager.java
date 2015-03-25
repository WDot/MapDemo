package com.example.migueldominguez.mapdemo;

import java.util.List;

/**
 * Created by Miguel Dominguez on 3/24/2015.
 */
public class ActorManager {
    List<ActorFragment> actors;

    ActorManager()
    {

    }

    public void addActor(ActorFragment actor)
    {
        actors.add(actor);
    }

    public void relocateActor(int index, Coordinates shiftedCoords)
    {
        actors.get(index).relocate(shiftedCoords);
    }

    public ActorFragment getActor(int index)
    {
        return actors.get(index);
    }
}
