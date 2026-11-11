package IFgram.ifpb.DTos;

import javax.xml.stream.events.Comment;
import java.time.LocalDateTime;

public record CommentResponse(
        Long id,
        String texto,
        LocalDateTime criadoEm,
        String autorNome,
        Long postId
) {
    public static CommentResponse from(Comment comment) {
        return new CommentResponse(
                comment.getId(),
                comment.getText(),
                comment.getCriadoEm(),
                comment.getAutor().getNome(),
                comment.getPost().getId()
        );
        ;

    }
}