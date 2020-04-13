package com.e.birdbook;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

class BirdListPackage extends BirdPackage implements Package
{
    private List<String> names;

    public BirdListPackage(Results bir)
    {
        names = new ArrayList<String>();

        Enumeration<String> nameEnum = bir.getResults().keys();
        while(nameEnum.hasMoreElements())
        {
            names.add(nameEnum.nextElement());
        }

        Request.TYPE type = Request.TYPE.BIRDLIST;
    }

    public List<String> getNames()
    {
        return this.names;
    }
}
