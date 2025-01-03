import java.util.*;

public class Inventory <T extends Item>{
    private HashMap<String, T> items = new HashMap<>();

    public Inventory(){
        items=new HashMap<>();
    }

    public void addItem(T Item) throws InValidQuantityException {
        //System.out.println("quantity is "+Item.getQuantity());
        if(Item.getQuantity()<=0)
        {
            throw new InValidQuantityException("Quantity is less than zero. Invalid entry");
        }
        if(items.containsKey(Item.getID()))
        {
            System.out.println("Item already exists");
            throw new DuplicateItemException("Item "+Item.getName()+ " already exists");
            //return;
        }
        else
        {
            System.out.println("Adding Item "+Item.getID());
            items.put(Item.getID(),Item);
        }

    }

    public void removeItem(String id) {
        if(items.containsKey(id)){
            items.remove(id);
        }
        else
        {
            System.out.println("Item not found");
            return;
        }
    }

    public T getItem(String id) {
        if(items.containsKey(id))
        {
            return items.get(id);
        }
        else
        {
            System.out.println("Item not found");
            return null;
        }
    }

    public List<T> getAllItems() {
        return new ArrayList<>(items.values());

    }

    public List<T> sortItems(Comparator<T> comparator)
    {
        List<T> sortedItems = new ArrayList<>(items.values());
        Collections.sort(sortedItems,comparator);
        return sortedItems;
    }

    public List<T> filterByPrice(double minPrice , double maxPrice)
    {
        List<T> filtered = new ArrayList<>();
        for(T item : items.values())
        {
            if(item.getPrice()>=minPrice && item.getPrice()<=maxPrice)
                filtered.add(item);
        }
        return filtered;
    }

    public List<T> filterByAvailability(){
        List<T> filtered = new ArrayList<>();
        for(T item : items.values()){
            if (item.getQuantity()>0)
                filtered.add(item);
        }
        return filtered;
    }

}
