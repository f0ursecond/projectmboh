-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Feb 21, 2023 at 04:41 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.0.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_zul_portfolio1`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_jenis`
--

CREATE TABLE `tb_jenis` (
  `transaksi` int(5) NOT NULL,
  `alamat_kirim` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tb_pokok`
--

CREATE TABLE `tb_pokok` (
  `id` int(11) NOT NULL,
  `transaksi` int(5) NOT NULL,
  `jenis_transaksi` varchar(50) NOT NULL,
  `layanan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_pokok`
--

INSERT INTO `tb_pokok` (`id`, `transaksi`, `jenis_transaksi`, `layanan`) VALUES
(3, 1, 'hoax', 'sambo'),
(4, 2, 'dada', 'wdawd'),
(5, 3, 'dawda', 'dasdaws'),
(6, 12, 'ya', 'buset');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_jenis`
--
ALTER TABLE `tb_jenis`
  ADD PRIMARY KEY (`transaksi`);

--
-- Indexes for table `tb_pokok`
--
ALTER TABLE `tb_pokok`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `transaksi` (`transaksi`),
  ADD KEY `transaksi_2` (`transaksi`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_pokok`
--
ALTER TABLE `tb_pokok`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
