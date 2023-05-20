-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 16, 2023 at 06:50 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `itinerary_planner`
--

-- --------------------------------------------------------

--
-- Table structure for table `tasks`
--

CREATE TABLE `tasks` (
  `task_id` int(11) NOT NULL,
  `title` varchar(30) NOT NULL,
  `description` varchar(100) NOT NULL,
  `budget` float NOT NULL,
  `category` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `task_tourist`
--

CREATE TABLE `task_tourist` (
  `task_id` int(11) NOT NULL,
  `uid` int(11) NOT NULL,
  `scheduled_time` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tourist`
--

CREATE TABLE `tourist` (
  `uid` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `dob` varchar(11) NOT NULL,
  `email` varchar(30) NOT NULL,
  `address` varchar(100) NOT NULL,
  `tpno` char(10) NOT NULL,
  `gender` varchar(6) NOT NULL,
  `uname` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tasks`
--
ALTER TABLE `tasks`
  ADD PRIMARY KEY (`task_id`);

--
-- Indexes for table `task_tourist`
--
ALTER TABLE `task_tourist`
  ADD PRIMARY KEY (`task_id`,`uid`),
  ADD KEY `userid_fk` (`uid`);

--
-- Indexes for table `tourist`
--
ALTER TABLE `tourist`
  ADD PRIMARY KEY (`uid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tasks`
--
ALTER TABLE `tasks`
  MODIFY `task_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tourist`
--
ALTER TABLE `tourist`
  MODIFY `uid` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `task_tourist`
--
ALTER TABLE `task_tourist`
  ADD CONSTRAINT `taskid_fk` FOREIGN KEY (`task_id`) REFERENCES `tasks` (`task_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `userid_fk` FOREIGN KEY (`uid`) REFERENCES `tourist` (`uid`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
