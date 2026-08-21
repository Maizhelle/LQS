import javax.swing.*;
import java.awt.*;

public class RoomReservationGUI extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RoomReservationGUI.class.getName());

    private javax.swing.JPanel pnlLeftColumn;
    private javax.swing.JPanel pnlStudentDetails;
    private javax.swing.JLabel lblStudentName;
    private java.awt.TextField txtStudentName;
    private javax.swing.JLabel lblStudentID;
    private java.awt.TextField txtStudentID;
    private javax.swing.JLabel lblDate;
    private java.awt.TextField txtDate;
    private javax.swing.JLabel lblStartTime;
    private javax.swing.JComboBox<String> cmbStartTime;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JComboBox<String> cmbDuration;
    private javax.swing.JButton btnReserve;

    private javax.swing.JPanel pnlReservationDetails;
    private javax.swing.JLabel lblReservationCodeTitle;
    private javax.swing.JLabel lblOutputReservationCode;
    private javax.swing.JLabel lblOutputStudentNameTitle;
    private javax.swing.JLabel lblOutputStudentName;
    private javax.swing.JLabel lblOutputDateTitle;
    private javax.swing.JLabel lblOutputDate;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblOutputTime;
    private javax.swing.JLabel lblOutputDurationTitle;
    private javax.swing.JLabel lblOutputDuration;
    private javax.swing.JLabel lblOutputStatusTitle;
    private javax.swing.JLabel lblOutputStatus;
    private javax.swing.JButton btnDone;

    private javax.swing.JPanel pnlRoomsContainer;
    
    // ROOM 1
    private javax.swing.JPanel pnlRoom1Outer;
    private javax.swing.JLabel lblRoom1Title;
    private javax.swing.JButton btnRemoveRoom1;
    private javax.swing.JScrollPane scrollRoom1;
    private javax.swing.JPanel pnlRoom1Content;
    private javax.swing.JLabel lblRoom1NumberTitle;
    private javax.swing.JLabel lblRoom1Number;
    private javax.swing.JLabel lblRoom1Reservation;
    private javax.swing.JLabel lblRoom1Code;
    private javax.swing.JLabel lblRoom1CheckInTitle;
    private javax.swing.JLabel lblRoom1CheckIn;
    private javax.swing.JLabel lblRoom1TimerTitle;
    private javax.swing.JLabel lblRoom1Timer;

    // ROOM 2
    private javax.swing.JPanel pnlRoom2Outer;
    private javax.swing.JLabel lblRoom2Title;
    private javax.swing.JButton btnRemoveRoom2;
    private javax.swing.JScrollPane scrollRoom2;
    private javax.swing.JPanel pnlRoom2Content;
    private javax.swing.JLabel lblRoom2NumberTitle;
    private javax.swing.JLabel lblRoom2Number;
    private javax.swing.JLabel lblRoom2Reservation;
    private javax.swing.JLabel lblRoom2Code;
    private javax.swing.JLabel lblRoom2CheckInTitle;
    private javax.swing.JLabel lblRoom2CheckIn;
    private javax.swing.JLabel lblRoom2TimerTitle;
    private javax.swing.JLabel lblRoom2Timer;

    // ROOM 3
    private javax.swing.JPanel pnlRoom3Outer;
    private javax.swing.JLabel lblRoom3Title;
    private javax.swing.JButton btnRemoveRoom3;
    private javax.swing.JScrollPane scrollRoom3;
    private javax.swing.JPanel pnlRoom3Content;
    private javax.swing.JLabel lblRoom3NumberTitle;
    private javax.swing.JLabel lblRoom3Number;
    private javax.swing.JLabel lblRoom3Reservation;
    private javax.swing.JLabel lblRoom3Code;
    private javax.swing.JLabel lblRoom3CheckInTitle;
    private javax.swing.JLabel lblRoom3CheckIn;
    private javax.swing.JLabel lblRoom3TimerTitle;
    private javax.swing.JLabel lblRoom3Timer;

    private javax.swing.JButton btnAddRoom;

    public RoomReservationGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        pnlLeftColumn = new javax.swing.JPanel();
        pnlStudentDetails = new javax.swing.JPanel();
        lblStudentName = new javax.swing.JLabel();
        txtStudentName = new java.awt.TextField();
        lblStudentID = new javax.swing.JLabel();
        txtStudentID = new java.awt.TextField();
        lblDate = new javax.swing.JLabel();
        txtDate = new java.awt.TextField();
        lblStartTime = new javax.swing.JLabel();
        cmbStartTime = new javax.swing.JComboBox<>();
        lblDuration = new javax.swing.JLabel();
        cmbDuration = new javax.swing.JComboBox<>();
        btnReserve = new javax.swing.JButton();

        pnlReservationDetails = new javax.swing.JPanel();
        lblReservationCodeTitle = new javax.swing.JLabel();
        lblOutputReservationCode = new javax.swing.JLabel();
        lblOutputStudentNameTitle = new javax.swing.JLabel();
        lblOutputStudentName = new javax.swing.JLabel();
        lblOutputDateTitle = new javax.swing.JLabel();
        lblOutputDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblOutputTime = new javax.swing.JLabel();
        lblOutputDurationTitle = new javax.swing.JLabel();
        lblOutputDuration = new javax.swing.JLabel();
        lblOutputStatusTitle = new javax.swing.JLabel();
        lblOutputStatus = new javax.swing.JLabel();
        btnDone = new javax.swing.JButton();

        pnlRoomsContainer = new javax.swing.JPanel();
        
        // ROOM 1 with ScrollPane
        pnlRoom1Outer = new javax.swing.JPanel();
        lblRoom1Title = new javax.swing.JLabel();
        btnRemoveRoom1 = new javax.swing.JButton();
        scrollRoom1 = new javax.swing.JScrollPane();
        pnlRoom1Content = new javax.swing.JPanel();
        lblRoom1NumberTitle = new javax.swing.JLabel();
        lblRoom1Number = new javax.swing.JLabel();
        lblRoom1Reservation = new javax.swing.JLabel();
        lblRoom1Code = new javax.swing.JLabel();
        lblRoom1CheckInTitle = new javax.swing.JLabel();
        lblRoom1CheckIn = new javax.swing.JLabel();
        lblRoom1TimerTitle = new javax.swing.JLabel();
        lblRoom1Timer = new javax.swing.JLabel();

        // ROOM 2 with ScrollPane
        pnlRoom2Outer = new javax.swing.JPanel();
        lblRoom2Title = new javax.swing.JLabel();
        btnRemoveRoom2 = new javax.swing.JButton();
        scrollRoom2 = new javax.swing.JScrollPane();
        pnlRoom2Content = new javax.swing.JPanel();
        lblRoom2NumberTitle = new javax.swing.JLabel();
        lblRoom2Number = new javax.swing.JLabel();
        lblRoom2Reservation = new javax.swing.JLabel();
        lblRoom2Code = new javax.swing.JLabel();
        lblRoom2CheckInTitle = new javax.swing.JLabel();
        lblRoom2CheckIn = new javax.swing.JLabel();
        lblRoom2TimerTitle = new javax.swing.JLabel();
        lblRoom2Timer = new javax.swing.JLabel();

        // ROOM 3 with ScrollPane
        pnlRoom3Outer = new javax.swing.JPanel();
        lblRoom3Title = new javax.swing.JLabel();
        btnRemoveRoom3 = new javax.swing.JButton();
        scrollRoom3 = new javax.swing.JScrollPane();
        pnlRoom3Content = new javax.swing.JPanel();
        lblRoom3NumberTitle = new javax.swing.JLabel();
        lblRoom3Number = new javax.swing.JLabel();
        lblRoom3Reservation = new javax.swing.JLabel();
        lblRoom3Code = new javax.swing.JLabel();
        lblRoom3CheckInTitle = new javax.swing.JLabel();
        lblRoom3CheckIn = new javax.swing.JLabel();
        lblRoom3TimerTitle = new javax.swing.JLabel();
        lblRoom3Timer = new javax.swing.JLabel();

        btnAddRoom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ROOM RESERVATION SYSTEM");

        // --- STUDENT DETAILS PANEL ---
        pnlStudentDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 20)));

        lblStudentName.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblStudentName.setText("Student Name");

        lblStudentID.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblStudentID.setText("Student ID");

        lblDate.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblDate.setText("Select Date");

        lblStartTime.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblStartTime.setText("Start Time");

        cmbStartTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM" }));

        lblDuration.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblDuration.setText("Duration");

        cmbDuration.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Hour", "2 Hours", "3 Hours" }));

        btnReserve.setBackground(new java.awt.Color(0, 0, 255));
        btnReserve.setFont(new java.awt.Font("Segoe UI", 1, 16));
        btnReserve.setForeground(new java.awt.Color(255, 255, 255));
        btnReserve.setText("RESERVE");

        javax.swing.GroupLayout pnlStudentDetailsLayout = new javax.swing.GroupLayout(pnlStudentDetails);
        pnlStudentDetails.setLayout(pnlStudentDetailsLayout);
        pnlStudentDetailsLayout.setHorizontalGroup(
            pnlStudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStudentDetailsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlStudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStudentName)
                    .addComponent(lblStudentID)
                    .addComponent(lblDate)
                    .addComponent(lblStartTime)
                    .addComponent(lblDuration))
                .addGap(30, 30, 30)
                .addGroup(pnlStudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtStudentName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txtStudentID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbStartTime, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbDuration, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlStudentDetailsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReserve, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        pnlStudentDetailsLayout.setVerticalGroup(
            pnlStudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStudentDetailsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlStudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStudentName)
                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlStudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStudentID)
                    .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlStudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlStudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartTime)
                    .addComponent(cmbStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlStudentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDuration)
                    .addComponent(cmbDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnReserve, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        // --- RESERVATION DETAILS PANEL ---
        pnlReservationDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reservation Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 20)));

        lblReservationCodeTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblReservationCodeTitle.setText("Reservation Code");

        lblOutputReservationCode.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblOutputReservationCode.setForeground(new java.awt.Color(51, 153, 0));
        lblOutputReservationCode.setText("---");

        lblOutputStudentNameTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblOutputStudentNameTitle.setText("Student Name");

        lblOutputStudentName.setText("---");

        lblOutputDateTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblOutputDateTitle.setText("Date");

        lblOutputDate.setText("---");

        lblTime.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblTime.setText("Time");

        lblOutputTime.setText("---");

        lblOutputDurationTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblOutputDurationTitle.setText("Duration");

        lblOutputDuration.setText("---");

        lblOutputStatusTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblOutputStatusTitle.setText("Status");

        lblOutputStatus.setText("---");

        btnDone.setBackground(new java.awt.Color(0, 153, 0));
        btnDone.setFont(new java.awt.Font("Segoe UI", 1, 16));
        btnDone.setForeground(new java.awt.Color(255, 255, 255));
        btnDone.setText("DONE");

        javax.swing.GroupLayout pnlReservationDetailsLayout = new javax.swing.GroupLayout(pnlReservationDetails);
        pnlReservationDetails.setLayout(pnlReservationDetailsLayout);
        pnlReservationDetailsLayout.setHorizontalGroup(
            pnlReservationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReservationDetailsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlReservationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblReservationCodeTitle)
                    .addComponent(lblOutputStudentNameTitle)
                    .addComponent(lblOutputDateTitle)
                    .addComponent(lblTime)
                    .addComponent(lblOutputDurationTitle)
                    .addComponent(lblOutputStatusTitle))
                .addGap(30, 30, 30)
                .addGroup(pnlReservationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblOutputReservationCode, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(lblOutputStudentName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOutputDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOutputTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOutputDuration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOutputStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReservationDetailsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        pnlReservationDetailsLayout.setVerticalGroup(
            pnlReservationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReservationDetailsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlReservationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReservationCodeTitle)
                    .addComponent(lblOutputReservationCode))
                .addGap(14, 14, 14)
                .addGroup(pnlReservationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOutputStudentNameTitle)
                    .addComponent(lblOutputStudentName))
                .addGap(14, 14, 14)
                .addGroup(pnlReservationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOutputDateTitle)
                    .addComponent(lblOutputDate))
                .addGap(14, 14, 14)
                .addGroup(pnlReservationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTime)
                    .addComponent(lblOutputTime))
                .addGap(14, 14, 14)
                .addGroup(pnlReservationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOutputDurationTitle)
                    .addComponent(lblOutputDuration))
                .addGap(14, 14, 14)
                .addGroup(pnlReservationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOutputStatusTitle)
                    .addComponent(lblOutputStatus))
                .addGap(18, 18, 18)
                .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        // --- LEFT COLUMN WRAPPER ---
        javax.swing.GroupLayout pnlLeftColumnLayout = new javax.swing.GroupLayout(pnlLeftColumn);
        pnlLeftColumn.setLayout(pnlLeftColumnLayout);
        pnlLeftColumnLayout.setHorizontalGroup(
            pnlLeftColumnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftColumnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLeftColumnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlStudentDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlReservationDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlLeftColumnLayout.setVerticalGroup(
            pnlLeftColumnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftColumnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlStudentDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlReservationDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        // --- ROOMS PANEL CONTAINER ---
        pnlRoomsContainer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rooms", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 24)));

        // --- ROOM 1 (Initialized with "---") ---
        pnlRoom1Outer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)));

        lblRoom1Title.setFont(new java.awt.Font("Segoe UI", 1, 20));
        lblRoom1Title.setForeground(new java.awt.Color(204, 153, 0));
        lblRoom1Title.setText("ROOM 1");

        btnRemoveRoom1.setBackground(new java.awt.Color(153, 0, 0));
        btnRemoveRoom1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        btnRemoveRoom1.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveRoom1.setText("-");

        scrollRoom1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        lblRoom1NumberTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom1NumberTitle.setText("Room #:");

        lblRoom1Number.setText("---");

        lblRoom1Reservation.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom1Reservation.setText("Reservation Code:");

        lblRoom1Code.setText("---");

        lblRoom1CheckInTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom1CheckInTitle.setText("Checked In:");

        lblRoom1CheckIn.setText("---");

        lblRoom1TimerTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom1TimerTitle.setText("Time Remaining:");

        lblRoom1Timer.setText("---");

        javax.swing.GroupLayout pnlRoom1ContentLayout = new javax.swing.GroupLayout(pnlRoom1Content);
        pnlRoom1Content.setLayout(pnlRoom1ContentLayout);
        pnlRoom1ContentLayout.setHorizontalGroup(
            pnlRoom1ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom1ContentLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlRoom1ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRoom1NumberTitle)
                    .addComponent(lblRoom1Reservation)
                    .addComponent(lblRoom1CheckInTitle)
                    .addComponent(lblRoom1TimerTitle))
                .addGap(86, 86, 86)
                .addGroup(pnlRoom1ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRoom1Timer)
                    .addComponent(lblRoom1CheckIn)
                    .addComponent(lblRoom1Code)
                    .addComponent(lblRoom1Number))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        pnlRoom1ContentLayout.setVerticalGroup(
            pnlRoom1ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom1ContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRoom1ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom1NumberTitle)
                    .addComponent(lblRoom1Number))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRoom1ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom1Reservation)
                    .addComponent(lblRoom1Code))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRoom1ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom1CheckInTitle)
                    .addComponent(lblRoom1CheckIn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRoom1ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom1TimerTitle)
                    .addComponent(lblRoom1Timer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrollRoom1.setViewportView(pnlRoom1Content);

        javax.swing.GroupLayout pnlRoom1OuterLayout = new javax.swing.GroupLayout(pnlRoom1Outer);
        pnlRoom1Outer.setLayout(pnlRoom1OuterLayout);
        pnlRoom1OuterLayout.setHorizontalGroup(
            pnlRoom1OuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom1OuterLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblRoom1Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemoveRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(scrollRoom1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
        pnlRoom1OuterLayout.setVerticalGroup(
            pnlRoom1OuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom1OuterLayout.createSequentialGroup()
                .addGroup(pnlRoom1OuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemoveRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlRoom1OuterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblRoom1Title)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        // --- ROOM 2 (Initialized with "---") ---
        pnlRoom2Outer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 18)));

        lblRoom2Title.setFont(new java.awt.Font("Segoe UI", 1, 20));
        lblRoom2Title.setForeground(new java.awt.Color(204, 153, 0));
        lblRoom2Title.setText("ROOM 2");

        btnRemoveRoom2.setBackground(new java.awt.Color(153, 0, 0));
        btnRemoveRoom2.setFont(new java.awt.Font("Segoe UI", 1, 18));
        btnRemoveRoom2.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveRoom2.setText("-");

        scrollRoom2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        lblRoom2NumberTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom2NumberTitle.setText("Room #:");

        lblRoom2Number.setText("---");

        lblRoom2Reservation.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom2Reservation.setText("Reservation Code:");

        lblRoom2Code.setText("---");

        lblRoom2CheckInTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom2CheckInTitle.setText("Checked In:");

        lblRoom2CheckIn.setText("---");

        lblRoom2TimerTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom2TimerTitle.setText("Time Remaining:");

        lblRoom2Timer.setText("---");

        javax.swing.GroupLayout pnlRoom2ContentLayout = new javax.swing.GroupLayout(pnlRoom2Content);
        pnlRoom2Content.setLayout(pnlRoom2ContentLayout);
        pnlRoom2ContentLayout.setHorizontalGroup(
            pnlRoom2ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom2ContentLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlRoom2ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRoom2NumberTitle)
                    .addComponent(lblRoom2Reservation)
                    .addComponent(lblRoom2CheckInTitle)
                    .addComponent(lblRoom2TimerTitle))
                .addGap(86, 86, 86)
                .addGroup(pnlRoom2ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRoom2Timer)
                    .addComponent(lblRoom2CheckIn)
                    .addComponent(lblRoom2Code)
                    .addComponent(lblRoom2Number))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        pnlRoom2ContentLayout.setVerticalGroup(
            pnlRoom2ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom2ContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRoom2ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom2NumberTitle)
                    .addComponent(lblRoom2Number))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRoom2ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom2Reservation)
                    .addComponent(lblRoom2Code))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRoom2ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom2CheckInTitle)
                    .addComponent(lblRoom2CheckIn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRoom2ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom2TimerTitle)
                    .addComponent(lblRoom2Timer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrollRoom2.setViewportView(pnlRoom2Content);

        javax.swing.GroupLayout pnlRoom2OuterLayout = new javax.swing.GroupLayout(pnlRoom2Outer);
        pnlRoom2Outer.setLayout(pnlRoom2OuterLayout);
        pnlRoom2OuterLayout.setHorizontalGroup(
            pnlRoom2OuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom2OuterLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblRoom2Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemoveRoom2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(scrollRoom2, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
        pnlRoom2OuterLayout.setVerticalGroup(
            pnlRoom2OuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom2OuterLayout.createSequentialGroup()
                .addGroup(pnlRoom2OuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemoveRoom2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlRoom2OuterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblRoom2Title)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollRoom2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        // --- ROOM 3 (Initialized with "---") ---
        pnlRoom3Outer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 18)));

        lblRoom3Title.setFont(new java.awt.Font("Segoe UI", 1, 20));
        lblRoom3Title.setForeground(new java.awt.Color(204, 153, 0));
        lblRoom3Title.setText("ROOM 3");

        btnRemoveRoom3.setBackground(new java.awt.Color(153, 0, 0));
        btnRemoveRoom3.setFont(new java.awt.Font("Segoe UI", 1, 18));
        btnRemoveRoom3.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveRoom3.setText("-");

        scrollRoom3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        lblRoom3NumberTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom3NumberTitle.setText("Room #:");

        lblRoom3Number.setText("---");

        lblRoom3Reservation.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom3Reservation.setText("Reservation Code:");

        lblRoom3Code.setText("---");

        lblRoom3CheckInTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom3CheckInTitle.setText("Checked In:");

        lblRoom3CheckIn.setText("---");

        lblRoom3TimerTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lblRoom3TimerTitle.setText("Time Remaining:");

        lblRoom3Timer.setText("---");

        javax.swing.GroupLayout pnlRoom3ContentLayout = new javax.swing.GroupLayout(pnlRoom3Content);
        pnlRoom3Content.setLayout(pnlRoom3ContentLayout);
        pnlRoom3ContentLayout.setHorizontalGroup(
            pnlRoom3ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom3ContentLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlRoom3ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRoom3NumberTitle)
                    .addComponent(lblRoom3Reservation)
                    .addComponent(lblRoom3CheckInTitle)
                    .addComponent(lblRoom3TimerTitle))
                .addGap(85, 85, 85)
                .addGroup(pnlRoom3ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRoom3Timer)
                    .addComponent(lblRoom3CheckIn)
                    .addComponent(lblRoom3Code)
                    .addComponent(lblRoom3Number))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        pnlRoom3ContentLayout.setVerticalGroup(
            pnlRoom3ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom3ContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRoom3ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom3NumberTitle)
                    .addComponent(lblRoom3Number))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRoom3ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom3Reservation)
                    .addComponent(lblRoom3Code))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRoom3ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom3CheckInTitle)
                    .addComponent(lblRoom3CheckIn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRoom3ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom3TimerTitle)
                    .addComponent(lblRoom3Timer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrollRoom3.setViewportView(pnlRoom3Content);

        javax.swing.GroupLayout pnlRoom3OuterLayout = new javax.swing.GroupLayout(pnlRoom3Outer);
        pnlRoom3Outer.setLayout(pnlRoom3OuterLayout);
        pnlRoom3OuterLayout.setHorizontalGroup(
            pnlRoom3OuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom3OuterLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblRoom3Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemoveRoom3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(scrollRoom3, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
        pnlRoom3OuterLayout.setVerticalGroup(
            pnlRoom3OuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoom3OuterLayout.createSequentialGroup()
                .addGroup(pnlRoom3OuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemoveRoom3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlRoom3OuterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblRoom3Title)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollRoom3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAddRoom.setText("Add Room");

        javax.swing.GroupLayout pnlRoomsContainerLayout = new javax.swing.GroupLayout(pnlRoomsContainer);
        pnlRoomsContainer.setLayout(pnlRoomsContainerLayout);
        pnlRoomsContainerLayout.setHorizontalGroup(
            pnlRoomsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoomsContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRoomsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlRoom1Outer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRoom2Outer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRoom3Outer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlRoomsContainerLayout.createSequentialGroup()
                        .addComponent(btnAddRoom)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlRoomsContainerLayout.setVerticalGroup(
            pnlRoomsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoomsContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRoom1Outer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRoom2Outer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRoom3Outer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddRoom)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        // --- MAIN FRAME LAYOUT ---
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLeftColumn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRoomsContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlLeftColumn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRoomsContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }

    // --- Public Getters for Backend Data Control ---
    public JLabel getLblOutputReservationCode() { return lblOutputReservationCode; }
    public JLabel getLblOutputStudentName() { return lblOutputStudentName; }
    public JLabel getLblOutputDate() { return lblOutputDate; }
    public JLabel getLblOutputTime() { return lblOutputTime; }
    public JLabel getLblOutputDuration() { return lblOutputDuration; }
    public JLabel getLblOutputStatus() { return lblOutputStatus; }
    
    // Room Getters
    public JLabel getLblRoom1Title() { return lblRoom1Title; }
    public JLabel getLblRoom1Number() { return lblRoom1Number; }
    public JLabel getLblRoom1Code() { return lblRoom1Code; }
    public JLabel getLblRoom1CheckIn() { return lblRoom1CheckIn; }
    public JLabel getLblRoom1Timer() { return lblRoom1Timer; }
    public JPanel getPnlRoom1Content() { return pnlRoom1Content; }

    public JLabel getLblRoom2Title() { return lblRoom2Title; }
    public JLabel getLblRoom2Number() { return lblRoom2Number; }
    public JLabel getLblRoom2Code() { return lblRoom2Code; }
    public JLabel getLblRoom2CheckIn() { return lblRoom2CheckIn; }
    public JLabel getLblRoom2Timer() { return lblRoom2Timer; }
    public JPanel getPnlRoom2Content() { return pnlRoom2Content; }

    public JLabel getLblRoom3Title() { return lblRoom3Title; }
    public JLabel getLblRoom3Number() { return lblRoom3Number; }
    public JLabel getLblRoom3Code() { return lblRoom3Code; }
    public JLabel getLblRoom3CheckIn() { return lblRoom3CheckIn; }
    public JLabel getLblRoom3Timer() { return lblRoom3Timer; }
    public JPanel getPnlRoom3Content() { return pnlRoom3Content; }

    public JButton getBtnReserve() { return btnReserve; }
    public JButton getBtnDone() { return btnDone; }
    public java.awt.TextField getTxtStudentName() { return txtStudentName; }
    public java.awt.TextField getTxtStudentID() { return txtStudentID; }
    public java.awt.TextField getTxtDate() { return txtDate; }
    public JComboBox<String> getCmbStartTime() { return cmbStartTime; }
    public JComboBox<String> getCmbDuration() { return cmbDuration; }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new RoomReservationGUI().setVisible(true));
    }
}