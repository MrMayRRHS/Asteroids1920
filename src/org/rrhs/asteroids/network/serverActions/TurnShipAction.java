package org.rrhs.asteroids.network.serverActions;

import org.rrhs.asteroids.actors.NetworkActor;
import org.rrhs.asteroids.network.Packet;
import org.rrhs.asteroids.network.Server;

public class TurnShipAction implements ServerAction
{
    @Override
    public void act(Server server, int clientID, Packet packet)
    {
        NetworkActor ship = server.getShip();
        String direction = packet.getData();
        if ("left".equals(direction))
        {
            ship.setRotationSpeed(-1);
        }
        else
        {
            ship.setRotationSpeed(1);
        }
        Packet p = new Packet("update", ship);
        server.send(p.toString());

    }
}
