import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecentlyViewed {
    private Integer MAX_SIZE=3;
    private LinkedList<Item> items;

/*    void addRecentlyViewedItem(Item item) {
        if (!recentlyViewed.contains(item) && recentlyViewed.size() < viewListSize) {
            recentlyViewed.addLast(item);
        } else if (recentlyViewed.contains(item) && recentlyViewed.size() < viewListSize) {
            recentlyViewed.remove(item);
            recentlyViewed.addLast(item);
        } else {
            recentlyViewed.removeFirst();
            recentlyViewed.addLast(item);
        }
    }
*/
    public RecentlyViewed(){
        items=new LinkedList<>();
    }

    public void addRecentlyViewedItem(Item item){
        items.remove(item);
        items.addFirst(item);
        if(items.size()>MAX_SIZE)
            items.removeLast();

        for(Item itm : getRecentlyViewedItems())
        {
            System.out.println("Added ++ "+itm.getName());
        }
    }
    public List<Item> getRecentlyViewedItems(){
        return new ArrayList<>(items);
    }

}

