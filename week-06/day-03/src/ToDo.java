import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

public class ToDo{

  private String title;
  private static final AtomicInteger count = new AtomicInteger(1);
  private int id;
  private LocalDateTime createdAt;
  private LocalDateTime completedAt;
  private boolean isCompleted;

  public ToDo(String title) {
    this.title = title;
    id = count.incrementAndGet();
    this.createdAt = LocalDateTime.now();
  }

  public ToDo() {
    this.title = title;
    id = count.incrementAndGet();
    this.createdAt = createdAt;
    this.completedAt = completedAt;
    this.isCompleted = isCompleted;
  }

  public String getTitle() {
    return title;
  }

  public int getId() {
    return id;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public LocalDateTime getCompletedAt() {
    return completedAt;
  }

  public boolean getIsCompleted() {
    return isCompleted;
  }


}
