

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL,
  `username` varchar(32) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `experience` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `username`, `email`, `password`, `experience`) VALUES
(2, 'oken', 'oken@gmail.com', '$2y$10$0qeXlYT.NiEF680PMPdd3udlBXGmQQVVqGxXkOQlfQu7OyCKmhDbu', 'Pro'),
(3, 'Ada', 'Ada@gmail.com', '$2y$10$3sbZhQGT4pgo9B7w.E99qOo3VijB4v3gQKuLIngigpKwDPJ1aaxp.', 'Amateur');
