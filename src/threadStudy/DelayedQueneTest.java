package threadStudy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @Description: 延时队列测试
 * @author Archer
 *
 */
public class DelayedQueneTest {
	public static void main(String[] args) throws InterruptedException {
		Item item1 = new Item("item1", 5, TimeUnit.SECONDS);
		Item item2 = new Item("tiem2", 10, TimeUnit.SECONDS);
		Item item3 = new Item("item3", 15, TimeUnit.SECONDS);
		DelayQueue<Item> queue = new DelayQueue<Item>();
		queue.put(item1);
		queue.put(item2);
		queue.put(item3);
		System.out.println("begin time: " + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		for(int i = 0;i < 3;i++) {
			Item take = queue.take();
			System.out.format("name:{%s}, time:{%s}\n", take.name,LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
		}
	}
}

class Item implements Delayed {
	/*
	 * 触发时间
	 */
	private long time;
	String name;

	public Item(String name, long time, TimeUnit unit) {
		this.name = name;
		this.time = System.currentTimeMillis() + (time > 0 ? unit.toMillis(time) : 0);
	}

	@Override
	public int compareTo(Delayed arg0) {
		Item item = (Item) arg0;
		long diff = this.time - item.time;
		if (diff <= 0) {
			return -1;
		} else {
			return 1;
		}
	}

	// 获取过期时间
	@Override
	public long getDelay(TimeUnit arg0) {
		return time - System.currentTimeMillis();
	}
}
