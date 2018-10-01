//package spring.blog.model;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import lombok.Data;
//import org.hibernate.annotations.OnDelete;
//import org.hibernate.annotations.OnDeleteAction;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//import java.util.Date;
//
//@Entity
//@Table(name = "comment")
//@Data public class Comment {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "comment_id")
//    private Integer id;
//
//    @NotNull
//    @Size(max = 250)
//
//    private String message;
//
//
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "comment_date")
//    private Date date = new Date();
//
//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id", nullable = false)
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    @JsonIgnoreProperties(value = {"password", "email", "isAdmin", "isActive"})
//    private User user;
//
//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "article_id", nullable = false)
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    @JsonIgnoreProperties(value = {"posted_at", "last_updated_at"})
//    private Article article;
//
//}