-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 15, 2020 at 12:47 PM
-- Server version: 10.1.8-MariaDB
-- PHP Version: 5.6.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dblaboratorium`
--

-- --------------------------------------------------------

--
-- Table structure for table `pengguna`
--

CREATE TABLE `pengguna` (
  `idpengguna` int(20) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `hakakses` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pengguna`
--

INSERT INTO `pengguna` (`idpengguna`, `username`, `password`, `hakakses`) VALUES
(123, 'ucok', '40bd001563085fc35165329ea1ff5c5ecbdbbeef', 'Laboran');

-- --------------------------------------------------------

--
-- Table structure for table `tbdataalat`
--

CREATE TABLE `tbdataalat` (
  `idalat` int(11) NOT NULL,
  `kode_alat` varchar(15) NOT NULL,
  `nama_alat` varchar(30) NOT NULL,
  `satuan` varchar(20) NOT NULL,
  `jumlah_stok` int(4) NOT NULL,
  `denda` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbdataalat`
--

INSERT INTO `tbdataalat` (`idalat`, `kode_alat`, `nama_alat`, `satuan`, `jumlah_stok`, `denda`) VALUES
(7, 'A-1', 'Smadav', 'Software', 2, 2000),
(11, 'A-2', 'mouse', 'Hardware', 12, 2000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbdataalat`
--
ALTER TABLE `tbdataalat`
  ADD PRIMARY KEY (`idalat`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbdataalat`
--
ALTER TABLE `tbdataalat`
  MODIFY `idalat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
