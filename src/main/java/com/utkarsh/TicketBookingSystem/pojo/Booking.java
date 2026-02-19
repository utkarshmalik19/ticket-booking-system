package com.utkarsh.TicketBookingSystem.pojo;

import com.utkarsh.TicketBookingSystem.enums.BookingStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "show_id")
    private Show show;
    private LocalDateTime bookingTime;
    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;
    private double totalAmount;
}
