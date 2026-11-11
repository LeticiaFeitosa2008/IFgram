package IFgram.ifpb.DTos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record CommentRequest (){
    @NotBlank(message = "0 texto do comentario é obrigatorio")
    @Size(max = 500, message = "O comentario deve ter no maximo 500 caracteres")
    public static String texto;

    @NotNull(message = "O ID do post é obrigatorio")
    public static Long postId;
}
