package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.xml.stream.events.Comment;
import java.util.List;

interface PostRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByPostId(Long postID);

    long countBypostId(Long postId);

    List<Comment> findByAutorId (Long autorId);


}
