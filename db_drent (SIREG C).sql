-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 26, 2022 at 09:42 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.0.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_rent`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_customer`
--

CREATE TABLE `tb_customer` (
  `id_cust` varchar(100) NOT NULL,
  `nama_cust` varchar(200) NOT NULL,
  `email` varchar(200) NOT NULL,
  `tgl_cust` date NOT NULL,
  `no_telp` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_customer`
--

INSERT INTO `tb_customer` (`id_cust`, `nama_cust`, `email`, `tgl_cust`, `no_telp`) VALUES
('A1', 'Andi Budiman', 'andibudiman@gmail.com', '2022-06-16', '081380982356'),
('A2', 'Aminah Megawati', 'megawati@yahoo.com', '2022-06-17', '084245671356'),
('A3', 'Mira Miranda', 'mamamiranda@gmail.com', '2022-07-20', '081267890932'),
('A4', 'Jimmy Soecipto', 'jimmysoe@yahoo.com', '2022-06-11', '085789436709'),
('A5', 'Hendra Wieranto', 'wieranto@gmail.com', '2022-07-02', '082264753092'),
('A6', 'Wina Wisa', 'wisewisa@gmail.com', '2022-05-01', '082287137212'),
('A7', 'Julia Hermawan', 'juliahermawan85@gmail.com', '2022-07-18', '081399002731'),
('A8', 'Bona Santoso', 'stsbona01@gmail.com', '2022-07-02', '083476908713'),
('A9', 'Rosa', 'wieranto@gmail.com', '2022-06-22', '089713526087'),
('A10', 'Damian F.', '1980damian@gmail.com', '2022-08-02', '081178903214');

-- --------------------------------------------------------

--
-- Table structure for table `tb_rumah`
--

CREATE TABLE `tb_rumah` (
  `id_rumah` int(10) NOT NULL,
  `alamat` text NOT NULL,
  `luas` int(11) NOT NULL,
  `harga_sewa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_rumah`
--

INSERT INTO `tb_rumah` (`id_rumah`, `alamat`, `luas`, `harga_sewa`) VALUES
(100, 'JL. Merdeka No. 1, Palembang', 300, 300000),
(102, 'JL. Merpati No. 15, Palembang', 250, 350000),
(103, 'JL. Merak No. 1, Riau', 400, 450000),
(104, 'JL. Jingga No. 15, Lampung', 450, 500000),
(105, 'JL. Gagak No. 103 Lampung', 300, 550000),
(106, 'JL. Merpati No. 14, Palembang', 200, 400000),
(107, 'JL. Beo No. 2A, Riau', 350, 450000),
(108, 'JL. Kasuari, Jambi', 250, 300000),
(109, 'JL. Camar No. 8, Padang', 250, 300000),
(110, 'JL. Merpati No. 10, Palembang', 300, 400000),
(111, 'JL. Rajawali No. 2, Padang', 300, 400000),
(112, 'JL. Elang, Padang', 400, 500000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_trx`
--

CREATE TABLE `tb_trx` (
  `id_trx` varchar(100) NOT NULL,
  `id_cust` varchar(200) NOT NULL,
  `id_rumah` int(11) NOT NULL,
  `qty` int(11) NOT NULL,
  `tgl_sewa` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_trx`
--

INSERT INTO `tb_trx` (`id_trx`, `id_cust`, `id_rumah`, `qty`, `tgl_sewa`) VALUES
('0001', 'A1', 102, 2, '2022-06-16'),
('0002', 'A4', 105, 1, '2022-06-17'),
('0003', 'A5', 104, 3, '2022-07-04'),
('0004', 'A9', 100, 2, '2022-07-10'),
('0005', 'A3', 101, 1, '2022-07-11'),
('0006', 'A5', 103, 5, '2022-08-16'),
('0007', 'A2', 106, 3, '2022-08-17'),
('0008', 'A6', 107, 1, '2022-08-17'),
('0009', 'A3', 111, 3, '2022-08-31'),
('0010', 'A4', 109, 1, '2022-09-11');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_rumah`
--
ALTER TABLE `tb_rumah`
  ADD PRIMARY KEY (`id_rumah`);

--
ALTER table 'tb_cust'
  ADD PRIMARY KEY ('id_cust');

ALTER table 'tb_trx'
  ADD PRIMARY KEY ('id_trx');
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_rumah`
--
ALTER TABLE `tb_rumah`
  MODIFY `id_rumah` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=113;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
