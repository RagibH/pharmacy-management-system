# Pharmacy Management System 💊

A Java Swing + MySQL based Pharmacy Management System built using **NetBeans IDE**.  
It manages medicines, customers, billing, and stock.  

---

## 🚀 Features
- Add, update, delete medicines
- Manage customers
- Billing system with invoice
- Database integration with MySQL (via XAMPP / phpMyAdmin)
- Executable `.exe` for quick run

---

## 📂 Project Structure
- `src/` → Java source code
- `db/pharma.sql` → Database export file
- `config.properties.example` → Database configuration template
- `PharmacySetup.exe` → Windows executable (requires database setup)

---

## ⚙️ How to Run (Source Code)
1. Clone this repository  
   ```bash
   git clone https://github.com/YOUR_USERNAME/pharmacy-management-system.git

2. Open in NetBeans IDE

3. Import Database: Open phpMyadmin --> Create a database named "pharma" --> Import file "db/pharma.sql"


4. Copy config.properties.example to config.properties [Update with your own database username and password]

5. Run the project in NetBeans

## 🖥️ How to Run (Executable)

1. Install XAMPP and start Apache & MySQL

2. Open phpMyAdmin → Import db/pharma.sql

3. Copy config.properties.example to config.properties

4. Set database username & password (default: root / ``)

5. Run PharmacySetup.exe


## 🛠️ Tech Stack

1. Java Swing (GUI)

2. MySQL (Database)

3. NetBeans IDE

4. XAMPP (Local server)