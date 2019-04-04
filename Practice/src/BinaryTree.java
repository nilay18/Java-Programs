//General Tree Node Structure
class BinaryTree{
	TreeNode root;
	
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int d){val=d;}
	}

	private TreeNode addRecursive(TreeNode current, int value) {
	    if (current == null) {
	        return new TreeNode(value);
	    }
	 
	    if (value < current.val) {
	        current.left = addRecursive(current.left, value);
	    } else if (value > current.val) {
	        current.right = addRecursive(current.right, value);
	    } else {
	    	//Value already exists
	        return current;
	    }
	    return current;
	}
	
	public void add(int value)
	{
		root = addRecursive(root,value);
	}
	
	public TreeNode invertTree(TreeNode root)
	{
		if(root == null) {return null;}
		TreeNode right = invertTree(root.right);
		TreeNode left = invertTree(root.left);
		root.left = right;
		root.right = left;
		return root;
	}
	
	public static void main(String[] args)
	{
		BinaryTree sol = new BinaryTree();
		sol.add(50);
		sol.add(100);
		sol.add(23);
		sol.add(16);
		sol.add(22);
		sol.add(67);
		sol.add(67);		
	}
}