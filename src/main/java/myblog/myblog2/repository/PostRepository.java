package myblog.myblog2.repository;

import myblog.myblog2.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository  extends JpaRepository<Post, Long> {
}
