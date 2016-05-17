package collection.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class Program {

	public static void main(String[] args) {
		
		
		//20160329
		//ArrayList �ǽ�
		//������ �������� �� ����
		System.out.println("<List>");
		
		List<String> list = new ArrayList<>();
		
		list.add("Hello");
		list.add("Nice to meet you!");
		list.add("Hello");
		list.add("Nice to meet you!");
		
		/*for(int i=0; i<list.size();i++)
			System.out.println(list.get(i));*/
		
		for(String s : list) // list�� ����� String ��ü�� �ϳ��� ������
			System.out.println(s);
		
		//Set
		//�ݺ��� �� �������� �ʰ� ������ ��(key) ��ü�� �ĺ��� ��� �����͸� ����
		System.out.println("<Set>");
		
		Set<String> sets = new HashSet<>();
		
		sets.add("Hello");
		sets.add("Nice to meet you!");
		sets.add("Hello");
		sets.add("Nice to meet you!");
		
		//get()�� ��� Iterator Ȱ��
		//HashSet�� �ߺ��� ������ �������� ����
		for(String s : sets)
			System.out.println(s);
		
			
		/*Iterator<String> it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());*/
		
		//Map
		//Key ���� �̸��� ����
		System.out.println("<Map>");
		
		Map<String, String> map = new HashMap();
		
		map.put("name", "�����");
		map.put("age", "24"); //�ߺ��� �ȵǰ� ��ü�ع���
		map.put("age", "25");
		
		System.out.println(map.get("age"));
		
		
		
		//��������  �÷��ǿ��� ��ü�� �о ������ ����ȯ�� �ؾ�����
		//���׸��� ���α׷��Ӱ� ���ϴ� ��ü�� Ÿ���� ����Ͽ�
		//�ǵ����� ���� ��ü�� �������� �ʰ�
		//�����Ͻÿ� ������ Ȯ���ϴ� ���

		//�پ��� Ÿ���� ��ü���� �ٷ�� �޼��峪 �÷��� Ŭ���� ������ ���� Ÿ�� üũ�� ���ִ� ���

		//generic = ���ø� = Ʋ(���۳� ����ǰ)
		/*GCollection<Exam> list = new GCollection<Exam>();
		 *GCollection�� ���� ä���!
		 * //<T extends Exam> �����Ƿ� Exam���� Ȯ��� �͵鸸 ��� ����

		list.add(3);
		list.add("11");
		list.add(30.3);
		list.add(new Exam());*/	

		
		
		//Thread
/*		GCollection list = new GCollection();
		
		for(int i=0; i<300; i++ )
			list.add(i+1);
		
		//���� ����
		for(int i=0; i<300; i++ )
			list.get(i);
		
		Thread th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				print(2, list);
			
			}
		});
		
		th.start(); // ����
		print(1, list);*/

		
		
		//�ڵ�
		//Thread�� �������� �ʴ�
		
		/*list.clear();
		while(list.hasNext())
			System.out.println(list.netx());*/
		
		//print(2, list);
	}
	
	/*private static void print(int key, GCollection list){
	
		
		
		for(int i=0; i<200; i++ )
			System.out.printf("key: %d, value: %d\n", key, list.get(i));
		ArrayList a = new ArrayList<>();
		Map<String, String> m = new HashMap<>();
		
		Iterator it = list.iterator();
		it.clear();
		while(it.hasNext())
			System.out.printf("key: %d, value: %d\n", key, it.netx());
	}*/

}
