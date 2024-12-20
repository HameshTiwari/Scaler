import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class TreeSizeCalculator implements Callable<Integer>{

    private Node root;
    private ExecutorService executorService;

    public TreeSizeCalculator(Node root, ExecutorService executorService){
        this.root=root;
        this.executorService=executorService;
    }

    @Override
    public Integer call() throws Exception {
        if (root==null)
        {
            return 0;
        }
        Callable<Integer> left = new TreeSizeCalculator(root.left,executorService);
        Callable<Integer> right = new TreeSizeCalculator(root.right,executorService);

        Integer leftSize = executorService.submit(left).get();
        Integer rightSize = executorService.submit(right).get();

        return 1+leftSize+rightSize;

    }

}
