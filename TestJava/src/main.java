import java.util.ArrayList;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data data = new Data(0, "0");
		Data data1 = new Data(1, "1");
		ArrayList<Data> list = new ArrayList<Data>();
		list.add(null);
		list.add(data);
		list.add(data1);
		data.i = 1;
		Data item = list.get(0);
		
		if (item == data) {
			/**ArrayList保存的对象data的引用,无论对象data怎么改变，list保存的data也会跟着改变**/
			System.out.println("对象是否相等");
		}
		ArrayList<Data> temp = list;
		ArrayList<Data> temp1 = list;
		temp.clear();
		StringBuilder builder = new StringBuilder();
		String str = builder.toString();
		int i = 0;
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(2);list1.add(2);list1.add(2);
		list1.add(3);
		list1.add(4);
		
		int index = 0;
		while (index < list1.size()) {
			int item1 = list1.get(index);
			if (item1 == 2) {
				list1.remove(index);
			}else{
				index ++ ;
			}
			
		}
		i = 1;
		String Theme_NAME_PREFIX           = "com.jb.gokeyboard.theme.";
		String packageName = "com.jb.gokeyboard.theme.fatherchristmas.getjar";
		
		String itemId = packageName.substring(Theme_NAME_PREFIX.length());
		itemId = Theme_NAME_PREFIX + itemId;
	}
	public static class Data{
		
		int i;
		String s;
		public Data(int i, String s) {
			// TODO Auto-generated constructor stub
			this.i = i;
			this.s = s;
		}
	}
}