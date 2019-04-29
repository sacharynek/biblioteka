package pl.vm.library.to;

import pl.vm.library.entity.Book;
import pl.vm.library.entity.User;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * Transport Object of the Reservation class.
 */
public class ReservationTo implements Serializable {

    private static final long serialVersionUID = -60690548233543094L;

    private Long id;

    private User user;

    @NotNull
    private Book book;

    @NotNull
    private Date fromDate;

    @NotNull
    private Date toDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
  /*
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
*/
    // TODO You can add fields which you need to finish the task.

}