use clap::Subcommand;

#[derive(Subcommand, Debug)]
pub enum Commands {
    /// Play a YouTube song by url
    Play {
        /// URL of the video
        #[arg(short, long)]
        url: String,
    },

    /// Download a YouTube song as MP3
    Download {
        /// URL of the video
        #[arg(short, long)]
        url: String,

        /// Output file path
        #[arg(short, long, default_value = "./")]
        output: String,
    },
}
