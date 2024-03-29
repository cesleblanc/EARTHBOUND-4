package main.java.villains;

import java.util.ArrayList;
import java.util.Random;

import main.java.villains.characters.EnemySpawnner;


/**
 * Implementation of LayerEngineer.
 *
 * @author camanjar
 */
public class LayerEngineer implements LayerBuilder {

    private EvilLayer evilLayer;
    private Random random = new Random(); //Used to create random tools

    private String[] colors = {"Downtown", "New", "San", "Green", "Hollow", "Mirky"};
    private String[] type = {"Water", "Tech", "Sketchy", "Market", "Palace", "Dark"};
    private  String[] strength = {"Bastion", "City", "Alley", "Hill"};

    public LayerEngineer() {
        evilLayer = new EvilLayer();
    }

    // Getters & Setters

    public void initRoster() {
        evilLayer.layerRoster = new ArrayList<EnemySpawnner>();
    }

    @Override
    public void buildLayerColor() {
        evilLayer.setLayerColor(colors[randomIndex(colors.length)]);
    }

    @Override
    public void buildLayerType() {
        evilLayer.setLayerType(type[randomIndex(type.length)]);
    }

    @Override
    public void buildLayerStrength() {

        evilLayer.setLayerStrength(strength[randomIndex(strength.length)]);
    }


    public EvilLayer getEvilLayer() {
        return evilLayer;
    }

    private int randomIndex(int max) {
        return (int) (random.nextInt(max));
    }

}
