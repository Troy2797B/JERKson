package io.zipcoder;

import io.zipcoder.utils.FileReader;
import io.zipcoder.utils.Item;
import io.zipcoder.utils.ItemParseException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemParser {
    public List<Item> parseItemList(String valueToParse) throws ItemParseException {
        String[] encryptedItems = valueToParse.replaceAll("##", " ").split(" ");
        ArrayList<Item> list = new ArrayList<>();
        for (String s : encryptedItems){
            list.add(parseSingleItem(s));
        }
        return list;
    }

    public Item parseSingleItem(String singleItem) throws ItemParseException {
        String[] encryptedProps = singleItem.replaceAll(";", " ").split(" ") ;
        String twoWords = "";
        //turn into array of encrypted Item properties ^^^
        //index [0] == Item.getName, index [1] == Item.getPrice, index [2] == item.getType, index == Item.getExpiration
        Item item = new Item(setName(),setPrice(),setExpiration(),setType());
        //find a way to get every index of the array to be a property of an item
//        return new Item(setName(), setPrice(),setType(),setExpiration());
       throw new ItemParseException();
    }

    public String setName(){
        //get an array of encrypted Fields
        //if the encryption.contains name | price | type | expiration

        return null;
    }
    public Double setPrice(){return null;}
    public String setType(){return null;}
    public String setExpiration(){return null;}
    public String findSingleItem(){

        return null;
    }


}
