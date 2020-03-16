package com.e.birdbook;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class BirdListContentPresenter
{
    public static UIFriendlyInfo makeUIFriendly(BirdListPackage bird)
    {
        Dictionary<String, String> info = new Hashtable<String, String>();

        List<String> names = bird.getNames();

        for(int i = 0; i < names.size(); i++)
        {
            info.put("TextName", names.get(i));
            //info.put("ImageView", images.get(i));
        }

        return new UIFriendlyInfo(info);
    }
}
